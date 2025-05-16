import java.util.List;
import java.util.ArrayList;

public class ColumnLength {
	public static int[] maxColLengths(List<String[]> rows) {
        if (rows == null || rows.isEmpty()) {
            return new int[0];
        }

        int numCols = rows.get(0).length;
        int[] maxLengths = new int[numCols];

        for (String[] row : rows) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] != null) {
                    maxLengths[i] = Math.max(maxLengths[i], row[i].length());
                }
            }
        }

        return maxLengths;
    }

	public static void main(String[] args) {
        List<String[]> rows = new ArrayList<>();
        rows.add(new String[]{"abcdqw", "aafdcw4ffs", "ddheehed", "ddwq43334"});
        rows.add(new String[]{"ab", "acbdw", "dddddddddd", "fdfdfdfdffe333d"});
        rows.add(new String[]{"fdswddddd", "ab", "dddd", "ddd3dffff3"});

        int[] result = maxColLengths(rows);

        for (int len : result) {
            System.out.print(len + " ");
        }
    }
}
