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
                return actor.getName();
            case 1:
                return actor.getSize();
            case 2:
                return actor.getDescription();
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

    private String name;
    private String size;
    private String description;

    public Actor(String name, String size, String description) {
        this.setName(name);
        this.setSize(size);
        this.setDescription(description);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
