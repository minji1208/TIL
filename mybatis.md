## Mybatis
Mybatis란 XML 구문과 어노테이션을 사용한 SQL문이나 저장된 프로시저를 데이터베이스와 자바 등을 연결시켜 주는 역할을 하는 영속성 프레임워크  
  
### 영속성 프레임워크 
: 정보에 대한 접근과 저장을 단순화하는 라이브러리  
JDBC 코드와 수동으로 설정하는 파라미터와 결과 매핑을 없애주고, 데이터베이스에 원시타입과 맵 인터페이스, 자바 객체를 설정하고 매핑하기 위한 XML과 어노테이션 사용   

### 스프링과 마이바티스-스프링을 연동한 데이터에 대한 흐름
컨트롤러 -> 서비스 로직 -> 매퍼 -> 매퍼 XML
```
- 컨트롤러 : 서비스 로직으로부터 데이터를 전달받음
- 서비스 로직 : 자바빈으로 구성, 데이터베이스를 검색하거나 관리
- 매퍼 : 인터페이스로 선언, 구현 클래스에서 SQL 문을 실행
- 매퍼 XML : SQL문으로 작성하는 매퍼 XML 구문
```

## Mybatis의 특징
- 자동으로 Connection close() 가능  
- 내부적으로 PreparedStatement 처리  
- #{프로퍼티}와 같이 속성을 지정하면 내부적으로 자동 처리  
- 리턴 타입을 지정하는 경우 자동으로 객체 생성 및 ResultSet 처리

## SQL Mapper XML 파일
DB 연동에 필요한 SQL 쿼리문들이 작성되는 파일  
```
- mapper : 루트 앨리먼트
- insert : 매핑된 INSERT문
- update : 매핑된 UPDATE문
- delete : 매핑된 DELETE문
- select : 매핑된 SELECT문
    - resultType, resultMap, fetchSize

- id : 필수 속성, 반드시 Mapper파일들 내에서 유일한 값으로 설정
- parameterType : SQL 실행에 필요한 데이터를 외부로부터 받아야할 때 사용
- parameterMap : 외부 parameterMap을 찾기 위한 접근 방법(비권장)
- statementType : Statement, Prepared(디폴트값), Callable 중 선택
```

#### CDATA 
'< ![CDATA[조건에 만족할시 실행할 sql문]]>'

#### if 문
< if test='조건문' >연결 문자열< /if>

## 2023/02/20 시험 정리
1. session = getSqlSessionFactory().openSession(false); 일 때, false의 역할  
: 자동 커밋 설정을 뜻하며, false 속성을 통해 commit을 직접 관리할 수 있다.  
2. mybatis-config.xml에서 < settings> 태그에 대해 작성하시오.  
: mybatis 구동 시 선언할 설정들을 작성하는 태그명  
3. Mybatis에서 SQL을 동적으로 제어할 수 있는 구문 종류 4가지  
: if, choose(when, otherwise), trim(where, set), foreach  
4. resultType과 resultMap의 차이점  
: resultType은 resultset 결과를 매핑해서 반환되는 타입의 전체 클래스명이나 별명, resultMap은 resultset 결과를 매핑할 resultMap 참조 아이디명  

