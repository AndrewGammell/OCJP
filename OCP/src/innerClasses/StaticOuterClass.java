package innerClasses;

public class StaticOuterClass {
	
	static class StaticInnerClass{
		private int var = 19;
		
		public int getVar() {
			return var;
		}
	}

	public static void main(String[] args) {
		StaticInnerClass inner = new StaticInnerClass();

		System.out.println(inner.var);
	}

}
