package gridlife.cn;

public class AArt {
	public static void main(String[] args) {
		String a="ab ef";
		String b="";
		String d=" ";
		String e=" bcd";
		String f="abc ";
		String g="abcd";
		System.out.println(a+"--"+isSpace(a));
		System.out.println(b+"--"+isSpace(b));
		
		System.out.println(d+"--"+isSpace(d));
		System.out.println(e+"--"+isSpace(e));
		System.out.println(f+"--"+isSpace(f));
		System.out.println(g+"--"+isSpace(g));
	}
	private static boolean isSpace(final String s) {
        if (s == null) return true;
        for (int i = 0, len = s.length(); i < len; ++i) {
        	// ��⣺ ������� �հ׷� �ͷ���false�� ����ǿհ׷� �ͼ���ѭ��
            if (!Character.isWhitespace(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
