package my.git.test;

public class StudentTest {
	public static void main(String[] args) {
		//여기서 소스를 수정하면 git의 워크트리에 있는 파일이 수정되는것임!!
		//워크트리    ->   인덱스    ->   로컬저장소 ->  원격저장소
		//     "add index"    "commit"     "push"
		
		Student st = new Student("하하", 40);
		System.out.println(st+"!!!!");
	}

}
