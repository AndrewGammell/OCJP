package override;

public class OverrideEqualsAndHashCode {
	private int id;
	
	public OverrideEqualsAndHashCode(int id) {
		this.id = id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof OverrideEqualsAndHashCode) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		OverrideEqualsAndHashCode obj1 = new OverrideEqualsAndHashCode(1);
		OverrideEqualsAndHashCode obj2 = new OverrideEqualsAndHashCode(1);
		
		System.out.println(obj1.equals(obj2));

	}

}
