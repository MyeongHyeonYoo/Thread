package MultiThread;

import java.awt.Toolkit;

public class Toolkit_Thread {

	public static void main(String[] args) {
		
		// Thread 클래스를 생성하고,
		// Thread 클래스 안에 run() 메소드를 재정의.

		// main 스레드와 거의 동시 작업
		Thread thread = new Thread(new Runnable() {
			
				@Override
				public void run() {
				// 작업 1 (소리 | 소리 안 들릴 시 이어폰 사용하여 확인)
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // 정적 메소드로 Toolkit 객체 얻기
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // 소리 출력
					try { Thread.sleep(500); } catch (Exception e) {} // 지연 효과 -> try ~ catch로 사용하여야 컴파일 된다.
				}
			}
		});
		
		thread.start();
		
		// 작업 2 (출력)
		for (int i = 0; i < 5; i++) {
			System.out.println("띵"); // 문자 출력
			try { Thread.sleep(500); } catch (Exception e) {} // 지연 효과 -> try ~ catch로 사용하여야 컴파일 된다.
		}
	}
}
