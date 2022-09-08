/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import control.Service;
import entity.Bill;
import entity.BookRoom;
import entity.Cart;
import entity.Customer;
import entity.Item;
import entity.Revenue;
import entity.UseService;
import entity.Voucher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nathenial
 */
public class BillDAO extends DBConnect {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    public void AddBill(Customer c, BookRoom bk, Voucher v) {
        try {
            String sql = "INSERT INTO Bill VALUES(?,?,GETDATE(),0, '0')";
            con = new DBConnect().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCid());
            ps.setInt(2, v.getVid());
            ps.executeUpdate();

            //take id Bill
            String sql1 = "select top 1 phid from Bill \n"
                    + "where cid = ?\n"
                    + "order by phid desc";
            PreparedStatement st1 = con.prepareStatement(sql1);
            st1.setInt(1, c.getCid());
            rs = st1.executeQuery();
            if (rs.next()) {
                int bid = rs.getInt(1);
                //add Book room
                String sql2 = "INSERT INTO BookRoom VALUES(?,?,?,?)";
                PreparedStatement st2 = con.prepareStatement(sql2);
                st2.setInt(1, bid);
                st2.setInt(2, bk.getRid());
                st2.setString(3, bk.getDatecheckin());
                st2.setString(4, bk.getDatecheckout());
                st2.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    public void UserService(Customer c, Cart cart) {
        try {
            String sql1 = "select top 1 phid from Bill \n"
                    + "where cid = ?\n"
                    + "order by phid desc";
            con = new DBConnect().getConnection();
            ps = con.prepareStatement(sql1);
            ps.setInt(1, c.getCid());
            rs = ps.executeQuery();
            if (rs.next()) {
                int bid = rs.getInt(1);
                for (Item i : cart.getItems()) {
                    String sql3 = "INSERT INTO UseService VALUES(?,?,?,?)";
                    PreparedStatement st3 = con.prepareStatement(sql3);
                    st3.setInt(1, bid);
                    st3.setInt(2, i.getServices().getSrid());
                    st3.setInt(3, i.getQuantity());
                    st3.setDouble(4, i.getPrice() * i.getQuantity());
                    st3.executeUpdate();
                }
            }
        } catch (Exception e) {
        }
    }

    public List<UseService> getUser(int cid) {
        List<UseService> list = new ArrayList<>();
        String query = "select l.phid, u.srid, s.sname, s.urlimage, u.quantity, u.price, s.price\n"
                + "from UseService as u, Services as s, Bill as l, Customer as c\n"
                + "where u.phid = l.phid and s.srid = u.srid and c.cid = l.cid and l.bstatus = 0 and l.cid = ?";
        try {
            con = new DBConnect().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new UseService(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getDouble(6),
                        rs.getDouble(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<BookRoom> getBook(int cid) {
        List<BookRoom> list = new ArrayList<>();
        String query = "select l.phid, b.rid, r.urlimage1, b.datecheckin, b.datecheckout, DATEDIFF(day, b.datecheckin, b.datecheckout) as bday, r.priceRoom, (DATEDIFF(day, b.datecheckin, b.datecheckout)) * r.priceRoom as total\n"
                + "from BookRoom as b, Room as r, Bill as l\n"
                + "where b.phid = l.phid and b.rid = r.rid and l.bstatus = 0 and l.cid = ?";
        try {
            con = new DBConnect().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BookRoom(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getDouble(7),
                        rs.getDouble(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Bill getABill(int cid) {
        String query = "select b.phid, b.cid, b.vid, v.discout, b.datePay, b.totalmoney, b.bstatus\n"
                + "from Bill as b, Voucher as v\n"
                + "where b.vid = v.vid and b.bstatus = 0 and b.cid = ?";
        try {
            con = new DBConnect().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Bill(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void upBill(int phid, double total) {
        String sql = "update Bill set totalmoney = ?, bstatus = 1  where phid = ?";
        try {
            con = new DBConnect().getConnection();
            ps = con.prepareStatement(sql);
            ps.setDouble(1, total);
            ps.setInt(2, phid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void DeleteBill(int phid) {
        String sql = "Begin Try\n"
                + "	Begin Tran\n"
                + "\n"
                + "	Declare @phidtoDelete int = ?\n"
                + "\n"
                + "	DELETE FROM BookRoom WHERE phid= @phidtoDelete\n"
                + "	DELETE FROM UseService WHERE phid= @phidtoDelete\n"
                + "	\n"
                + "	DELETE FROM Bill WHERE phid= @phidtoDelete\n"
                + "\n"
                + "	Commit Tran\n"
                + "End Try\n"
                + "\n"
                + "Begin Catch\n"
                + "	Rollback Tran\n"
                + "End Catch";
        try {
            con = new DBConnect().getConnection();
            ps = con.prepareStatement(sql);
            ps.setDouble(1, phid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Bill> vBill(String usid) {
        List<Bill> list = new ArrayList<>();
        String query = "select b.phid, b.cid, b.vid, v.discout, b.datePay, b.totalmoney, b.bstatus\n"
                + "from Bill as b, Customer as c, Voucher as v\n"
                + "where b.cid = c.cid and b.vid = v.vid and c.usid = ?";
        try {
            con = new DBConnect().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Bill(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

//    public List<Revenue> RevenueOfMonth() {
//        List<Revenue> list = new ArrayList<>();
//        String sql = "SELECT YEAR(datePay) AS [Year],MONTH(datePay) AS [Month], SUM(totalmoney) AS Total\n"
//                + "FROM Bill\n"
//                + "WHERE bstatus = 2\n"
//                + "GROUP BY YEAR(datePay),MONTH(datePay)";
//        try {
//            con = new DBConnect().getConnection();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {                
//                list.add(new Revenue(rs.getString(1), rs.getString(2), rs.getDouble(3)));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }

    public static void main(String[] args) {
        BillDAO dao = new BillDAO();

    }
}
