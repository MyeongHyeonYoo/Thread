package MultiThread;

import java.awt.Toolkit;

public class Toolkit_Thread {

	public static void main(String[] args) {
		
		// 작업 1 (소리 | 소리 안 들릴 시 이어폰 사용하여 확인)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch (Exception e) {}
		}
		
		// 작업 2 (출력)
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}

	}

}
