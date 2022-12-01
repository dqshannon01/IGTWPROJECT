import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class LogTable extends AbstractTableModel
{
    private String columnNames[]={"Date","Time","Note"};
    private ArrayList<Stamp>  stamps=new ArrayList<>();

    public LogTable(ArrayList<Stamp> stamps)
    {
        this.stamps=stamps;
    }

    @Override
    public String getColumnName(int columnIndex){
        return columnNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return stamps.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Stamp stamp=stamps.get(rowIndex);
        switch (columnIndex)
        {
            case 0:
                return stamp.getDate();
            case 1:
                return stamp.getTime();
            case 2:
                return stamp.getNote();
        }
        return null;
    }
}
