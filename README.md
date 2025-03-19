# 자동차 경주
---
> 이 프로젝트는 자동차 경주 게임을 구현한 것입니다. 여러 대의 자동차가 주어진 횟수만큼 경주를 진행하고, 각 자동차는 랜덤 값에 따라 전진하거나 멈추게 됩니다. 경주가 끝난 후, 가장 앞에 있는 자동차가 승리합니다.
---
## 1단계 - 움직이는 자동차 🏎️

### 🚀기능 요구사항
- 자동차는 이름을 가지고 있다.
- 자동차는 움직일 수 있다.
  - 0에서 9 사이의 rondom 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
---
## 2단계 - 우승 자동차 구하기 🏎️

### 🚀기능 요구사항
- n대의 자동차가 참여할 수 있다.
- 주어진 횟수 동안 n대의 random 값을 구한 후 random 값이 4이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 구할 수 있다. 우승자는 한 명 이상일 수 있다.
---
## 💻구현 방식
### 💬클래스 설명
- Car 클래스
  - name : 자동차의 이름.
  - position : 자동차의 현재 위치.
  - getPosition() : 자동차의 현재 위치 반환.
  - moveCar(int random) : random 값에 따라 자동차 위치 조정.
  - isWinner(int winningPosition) : 자동차의 우승 여부 확인.
- Racing 클래스
  - cars : 경주에 참가하는 n대의 자동차들의 목록 저장.
  - getCars() : 경주에 참가하는 n대의 자동차들의 리스트 반환.
  - createCars(int carNum) : carNum에 해당하는 개수의 자동차를 생성.
  - startRacing(int roundNum) : roundNum 횟수만큼 경주 진행.
  - round() : 각 라운드마다 자동차의 위치가 달라짐.
  - findWinner() : 가장 앞에 있는 우승 자동차 찾아 반환.
 
---
## 프로젝트 구조

📁 src
📁 main
📁 java
- 📁 application
  - 📄 RacingCarApplication.java
- 📁 domain
  - 📄 Car.java
  - 📄 Cars.java
  - 📄 MovingStrategy.java
  - 📄 Racing.java
  - 📄 RandomMovingStrategy.java
- 📁 view
  - 📄 InputView.java
  - 📄 OutputView.java

📁 test
📁 java
- 📁 domain
  - 📄 CarTest.java

