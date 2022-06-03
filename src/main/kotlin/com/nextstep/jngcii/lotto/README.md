# LOTTO

## STEP-2

### 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### 프로그래밍 요구사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
  - git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

### TODO-LIST
- [x] 입력 금액을 파싱하고 로또 개수를 반환하는 기능 구현 (Test)
- [x] 입력 금액을 파싱하고 로또 개수를 반환하는 기능 구현
- [x] 다른 로또와 비교하는 기능을 포함한 로또 1개에 대한 일급 컬렉션을 구현 (Test)
- [x] 다른 로또와 비교하는 기능을 포함한 로또 1개에 대한 일급 컬렉션을 구현
- [x] 로또 번호를 뽑는 로또머신을 구현 (Test)
- [x] 로또 번호를 뽑는 로또머신을 구현
- [x] 등수를 계산하는 기능 구현 (Test)
- [x] 등수를 계산하는 기능 구현
- [x] 로또들을 가지고 있는 기록지를 구현 (Test)
- [x] 로또들을 가지고 있는 기록지를 구현
- [x] 입력 당첨 번호를 파싱해 숫자리스트를 반환하는 기능 구현 (Test)
- [x] 입력 당첨 번호를 파싱해 숫자리스트를 반환하는 기능 구현
- [x] 수익률을 계산하는 기능 구현 (Test)
- [x] 수익률을 계산하는 기능 구현
- [x] 손해 여부를 확인하는 로직 구현 (Test)
- [x] 손해 여부를 확인하는 로직 구현
- [x] 출력기능 구현



## STEP-3

### 기능 요구사항
- 2등을 위해 추가 번호를 하나 더 추첨한다.
- 당첨 통계에 2등도 추가해야 한다.

### TODO-LIST
- [x] 보너스볼을 받는 Input 기능 구현 (Test) 
- [x] 보너스볼을 받는 Input 기능 구현
  - [x] 입력값이 반드시 존재해야 한다. 
  - [x] 보너스볼은 정수여야 한다.
- [x] 보너스공 LottoNumber를 구현 (Test)
- [x] 보너스공 LottoNumber를 구현
  - [x] 보너스볼 번호 범위 1~45가 아니라면 잘못되었다면 예외 발생
  - [x] 보너스볼이 지난주 로또 번호 6자리에 포함되면 예외를 발생한다.
- [x] Rank에 2등에 대한 로직 추가 (Test)
- [x] Rank에 2등에 대한 로직 추가
  - [x] 보너스볼과 관계없이, 6개-1등, 4개-4등, 3개-5등 에 대한 결과를 반환한다.
  - [x] 5개가 일치할 경우, 보너스볼에 따라 2등 / 3등을 반환한다.
- [x] 2등(보너스볼)에 대한 로직을 ResultView에 적용