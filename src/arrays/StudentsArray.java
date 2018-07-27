package arrays;

public class StudentsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = { "Dana", "Claci", "Cristos", "Muhammadjon" };

		// for (int index = 0; index < students.length; index++) {
		// System.out.println(students[index]);
		// }

		for (String name : students) {
			System.out.println(name);
		}

		int[] nums = { 10, 100, 20, 200, 300 };

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			
		}

		for (int n : nums) {
			System.out.println(n);
		}

	}

}
