package homework1;

import java.awt.Dimension;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Main {
    public static void main(String[] args) throws SQLException {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
            }
        });

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
        ResultSet resultSet = preparedStatement.executeQuery();
        JFrame frame = new JFrame();

        ArrayList<Actor> actors = new ArrayList<Actor>();

        while (resultSet.next()) {
            int actor_id = resultSet.getInt(1);
            String first_name = resultSet.getString(2);
            String last_name = resultSet.getString(3);
            actors.add(new Actor(actor_id, first_name, last_name));
        }

        TableModel model = new MyTableModel(actors);
        JTable table = new JTable(model);
        JButton button = new JButton();

        frame.add(new JScrollPane(table));
        frame.setBounds(500,500, 500,500);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}


