package homework1;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MyTableModel implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
    private List<Actor> actors;

    public MyTableModel(List<Actor> actors) {
        this.actors = actors;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 3;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Actor id";
            case 1:
                return "First name";
            case 2:
                return "Last name";
        }
        return "";
    }

    public int getRowCount() {
        return actors.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Actor actor = actors.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return actor.getActor_id();
            case 1:
                return actor.getFirst_name();
            case 2:
                return actor.getLast_name();
        }
        return "";
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {

    }

}

public class Actor {

    private int actor_id;
    private String first_name;
    private String last_name;

    public Actor(int actor_id, String first_name, String last_name) {
        this.setActor_id(actor_id);
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
