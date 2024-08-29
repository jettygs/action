import java.io.FileReader;

public class EightBall {
	public static void main(String args[]) throws Exception {
		char[] buffer = new char[1024];
		String filename = args[0];
		char[] buffer2 = new char[1024];
		String filename2 = args[0];

		try {
			filename = "" + (Integer.parseInt(filename) % 3);
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}
		new FileReader(filename2).read2(buffer2);
		System.out.println(buffer);

		String name = "sam";
		String name2 = "samsung";

		System.out.println(name);
		System.out.println(name2);

		// 수정!!
		// 왜 반영이 안 되는거지?? // 이것도 테스트해보시지
		// 추측1. main브랜치와 다른 코드가 있을 시 점검해주는것이다.
		// 추측2. 변화하는 브랜치인 test가 아니라 main에서 자꾸 코드를 가져와서 반영이 안 되는 것이다. -> jenkins에서 자꾸 main브랜치 코드를 가져오고 있었음.
		// 결론. 점검 대상 코드는 main브랜치의 코드가 아니라 test브랜치의 코드이기 때문에, jenkins에 설정된 빌드 대상 브랜치를 test로 변경, 점검 대상 코드 report생성 매우 잘 됨.

		// admin login password
		// rootpasswd is asdf ||
		/*
		administrator
		is root
		root admin
		*
		* */
	}
}
