# JSP
태그를 이용하여 고유한 문법을 기술하는 서버 프로그래밍 방식

## JSP 태그 방식
1. 스크립트 태그(Script Tag)
- 지시어(directive) : JSP 페이지의 속성 지정, <%@ %> 
- 선언문(declaration) : 전역변수 선언 및 메서드 선언 , <%! %>
- 표현식(expression) : 변수, 계산식, 함수 호출 결과를 문자열 형태로 출력 , <%= %>
```
_jspService() 내에 그대로 옮겨짐
```
- 스크립트릿(scriptlet) : 프로그래밍 코드 기술 , <% %>
```
jspService() 내에 그대로 옮겨짐, 단 out.print()로 변경
<% "표현식" %> = <% out.println("표현식") ;%>
```
- 주석(comments) : JSP 페이지의 설명 추가 , <%-- --%>
    
2. 액션 태그(Action Tag) : XML 스타일의 태그로 기술한 동작 기능을 수행하는 방식
- <jsp:include page="test.jsp" /> : 다른 페이지의 실행 결과를 현재의 페이지에 포함시킬 때 사용
- <jsp:forward page="test.jsp" /> : 현재 JSP 페이지의 제어를 다른 페이지에 이동시킬 때 사용
- <jsp:useBean id="member" class="MemeberVO" /> : 자바빈을 사용
- <jsp:setProperty name="member" property="user_id" /> : 자바빈의 속성을 지정하는 메서드를 호출
- <jsp:getProperty name="member" property="user_id" /> : 자바빈의 속성을 반환하는 메서드 호출

3. 커스텀 태그(Custom Tag) : 새로운 태그를 정의하여 이용하는 방법으로 JSP 만의 고유한 방식
- <tag:printData /> : 사용자가 직접 정의한 태그를 이용


## JSP 소스의 서블릿 변환

1. 변환 단계(Translation Step)
: 컨테이너는 JSP파일을 자바 파일로 변환

2. 컴파일 단계(Compile Step)
: 컨테이너는 변환된 자바 파일을 클래스 파일로 컴파일

3. 실행 단계(Interpret Step)
: 컨테이너는 class 파일을 실행하여 그 결과(HTML, CSS와 자바스크립트 코드)를 브라우저로 전송해 출력

## JSP 라이프 싸이클
### JSP 서블릿 클래스의 주요 메서드
- _jspInit() : 요구되는 자원의 연결 등의 초기화 작업을 수행
- **_jspService()** : 실제 클라이언트의 요청에 대한 작업 처리 수행으로, 클라이언트 요청 때마다 반복 수행
- _jspDestroy() : 웹서버 또는 애플리케이션이 종료되는 경우에 서블릿을 메모리에서 언로드하는 경우, JSP 서블릿 종료를 위한 작업 수행

### 서블릿 소스
```javascript
// 자바 소스에 대한 정보를 기술(import 등)
<%@ 지시자 속성=값 %>
public class 클래스명 { // 클래스 선언부
    // 멤버 변수와 메서드 선언
    <%! 선언문 %>
    public void _jspService(){ // JSP 요청시 자동 실행되는 메서드
        // JSP 코드를 자바 소스로 변환시 자동 생성되는 영역
        out.println(); // <= <% %>
        out.println(); // <= <%= %>
    }
}
```

>jsp에서 패키지 impot하는 법 
>- <%@ page import="자바 내장 패키지" %>
>- <%@ page import="패키지명.클래스명" %>
