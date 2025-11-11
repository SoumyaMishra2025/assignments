package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		String[] name = {"Suresh","Mahesh","Naresh"};
		int[] marks= {75, 80, 82};
		int[] gracemark= new int[marks.length];
		float total=0;
		
		for(int i=0;i<marks.length;i++) {
			
			gracemark[i]=marks[i]+=10;
			total+=gracemark[i];
			
		}
		
		System.out.println("Updated Marks:");
		
		for(int i=0;i<name.length;i++) {			
			System.out.println(name[i]+":"+gracemark[i]);
		}
				
		System.out.println("Average mark of all students is: " + total/3);
		
				

	}

}
