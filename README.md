# **Project - Thread [Multi Thread]**  🔻

 ## 💡 `Java` PROJECT (<img src="https://img.shields.io/badge/Java-17-purple">


---

### 🧾 프로젝트 소개 

---

>**ECLIPSE 환경 구축**

> 1. ECLIPSE 설치
> 2. JDK 설치

---


#### ◾ [Single Thread] - main Thread

<img src="img/sound_and_print.jpg">

##### 소리(띵) 5번 있은 후, "띵" 문자 5번 출력

---

#### ◾ [Multi Thread] - main Thread & Working Thread

- ##### Thread 클래스 사용 - 객체 생성
- ##### run() 메소드 재정의
- ##### thread.start() 메소드 호출하여 run() 실행

<img src="img/sound_and_print.jpg">

##### 소리가 나면서 문자가 출력되는 동시적 작업이 진행이 되는 것을 확인.

```
rest time :D

Thread 클래스 사용 (Thread.sleep() 메소드 호출 - 지연)
Toolkit 클래스 사용 (toolkit.beep() 메소드 호출 - 소리)

main thread가 실행 중, 
working thread(thread.start() -> run()) 실행되면서
동시 다발적으로 작업이 진행되는 것을 확인할 수 있다.

──────────────────────────────────────────────────────

p.s. run() 메소드 재정의
Runnable(인터페이스)의 추상메소드를 재정의 한 것

(+) Thread에도 run()메소드가 있다.

```


