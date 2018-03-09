package tracker.view;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MediaTableModel extends AbstractTableModel
{
	List<MediaPanel> panels;

	public MediaTableModel(List<MediaPanel> panels)
	{
		super();
		this.panels = panels;
	}

	public Class<MediaTable> getColumnClass(int columnIndex)
	{
		return MediaTable.class;
	}

	public int getColumnCount()
	{
		return 1;
	}

	public String getColumnName(int columnIndex)
	{
		return "MediaPanel";
	}

	public int getRowCount()
	{
		return (panels == null) ? 0 : panels.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex)
	{
		return (panels == null) ? null : panels.get(rowIndex);
	}

	public boolean isCellEditable(int columnIndex, int rowIndex)
	{
		return true;
	}
}
