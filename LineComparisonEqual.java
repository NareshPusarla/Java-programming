public class LineComparisonEqual{
	public boolean isEqual(int x1,int x2,int y1,int y2){
		double xlen = Math.sqrt((x2-x1)*(x2-x1));
		double ylen = Math.sqrt((y2-y1)*(y2-y1));
		if (xlen == ylen)
			return true;
		return false;
}
}
