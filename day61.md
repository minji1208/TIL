## 2023/03/15
오늘은 관리자 페이지 레이아웃 작업을 했다. 생각보다 오래 걸림... 그리고 port 번호를 80으로 설정하면 url 값이 http://localhost이 된다!!! 그리고 이제 svn 을 사용하여 프로젝트 형상관리를 하게 되었는데, 생각보다 복잡한 것 같아서... 공부가 많이 필요할 것 같다ㅎ

## 2023/03/16
오늘은 프로젝트를 진행하다가 스프링 빈에 대해 알게되었다. 스프링 빈은 스프링 컨테이너에 의해 관리되는 자바 객체(POJO)이다. 스프링 빈은 스프링 컨테이너가 생성된 후에 생성된다.  
스프링 컨테이너는 스프링 빈의 생명 주기를 관리하며, 생성된 스프링 빈들에게 추가적인 기능을 제공하는 역할을 한다. 스프링 빈을 등록하는 방식은 크게 두가지가 있다. @Component로 빈을 자동 등록하거나 @Configuration이 붙은 설정 파일 내에 특정 타입을 리턴하는 메소드 위에 @Bean을 붙여 등록하는 방법이 있다.  
@Component는 개발자가 직접 컨트롤이 가능한 클래스들의 경우에 사용되며, 클래스 또는 인터페이스 단위에 붙일 수 있다. @Bean은 개발자가 컨트롤할 수 없는 외부 라이브러리들을 Bean으로 등록하고 싶은 경우에 사용되며, 메소드 또는 어노테이션 단위에 붙일 수 있다.  
스프링 빈에는 스프링 컨테이너에서 한번만 생성되며, 컨테이너가 사라질 때 제거되는 싱글톤 빈과 의존성이 발생할 때마다 새롱누 객체가 생성되어 주입되는 프로토타입 빈이 있다.  
싱글톤 빈은 상태가 없는 공유 객체, 읽기 전용의 상태인 객체, 사용 빈도가 매우 높은 객체에 사용하고, 프로토타입 빈은 사용하 때마다 상태가 달라지는 객체, 쓰기가 가능한 상태가 있는 객체에 사용한다.  
싱글톤 빈의 생명 주기  
: 스프링 컨테이너 생성 -> 스프링 빈 생성 -> 의존 관계 주입 -> 초기화 콜백 -> 사용 -> 소멸 전 콜백 -> 스프링 종료  
프로토타입 빈의 생명주기  
:  스프링 컨테이너 생성 -> 스프링 빈 생성 -> 의존 관계 주입 -> 초기화 콜백 -> 사용 -> GC에 의해 수거
  
---------------------------
마지막으로 웹 스코프는 웹 환경에서만 동작하는 스코프이며 프로토 타입과 다르게 특정 주기가 끝날 때까지 관리해주는 것이다.  
웹 스코프의 종류는 4가지가 있다. 
- Request : HTTP 요청 하나가 들어오고 나갈 때까지 유지되는 스코프이다.  
            각각의 HTTP 요청마다 별도의 빈 인스턴스가 생성되고 관리된다.
- Session : HTTP Session과 동일한 생명 주기를 가지는 스코프이다. 
- Application : 서블릿 컨텍스트와 동일한 생명 주기를 가지는 스코프이다.
- Websocket : 웹 소켓과 동일한 생명 주기를 가지는 스코프이다.  
오늘 뭔가 많이 공부한 느낌...www