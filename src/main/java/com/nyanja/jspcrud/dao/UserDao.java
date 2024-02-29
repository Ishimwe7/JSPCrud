package com.nyanja.jspcrud.dao;

import com.nyanja.jspcrud.bean.User;
import com.nyanja.jspcrud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import  java.util.List;

import java.util.List;

public class UserDao {

    public static int save(User u) {
        int status = 0;
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(u);
            transaction.commit();
            status = 1;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        return status;
    }

    public static int update(User u) {
        int status = 0;
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(u);
            transaction.commit();
            status = 1;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        return status;
    }

    public static int delete(User u) {
        int status = 0;
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(u);
            transaction.commit();
            status = 1;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        return status;
    }

    public static List<User> getAllRecords() {
        List<User> list = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           // list = session.createQuery("from User", User.class).list();
            list = session.createQuery("select user from User user").list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static User getRecordById(int id) {
        User u = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            u = session.get(User.class, id);
        } catch (Exception e) {

        }
        return u;
    }
}