//package num111_120;
//
//interface Exportable{
//	void export();
//}
//
//class Tool implements Exportable{
//	protected void export() {
//		System.out.println("Tool::export");
//	}
//}
//
//class ReportTool extends Tool implements Exportable{
//	public void export() {
//		System.out.println("RTool::xport");
//	}
//	
//	public static void main(String[] args) {
//		Tool aTool = new ReportTool();
//		Tool bTool = new Tool();
//		callExport(aTool);
//		callExport(bTool);
//	}
//	
//	public static void callExport(Exportable ex) {
//		ex.export();
//	}
//}
//
//public class num112 {
//
//}
