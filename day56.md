## 2023/02/27
매핑 정보가 같은 경우 메서드 방법이 다르면 사용할 수 있음  
put은 수정, delete는 삭제할때 사용하는 매핑 방식들

## 2023/03/02
DAO -> XML -> SERVICE -> IMPLIMENT -> CONTROLLER -> VIEW 순서로 수정하기..
AOP는 기존의 코드를 수정하지 않고, 원하는 기능들과 결합할 수 있다. Target은 개발자가 작성한 핵심 비즈니스 로직을 가지는 객체이다. Proxy는 Target을 전체적으로 가지고 있는 존재이다. Proxy는 내부적으로 Target을 호출하하지만, 중간에 관심사를 거쳐서 Target을 호출하도록 작성함. JoinPoint는 Tartget 객체가 가진 메서드. 메서드와 관심사를 결합할 것인지 결정하는 것을 Pointcut이라고 한다. Aspects - 관심사 자체, Advice - Aspect를 구현한 공통 기능의 코드