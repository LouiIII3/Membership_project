# membership_project

<h2>회원가입 project</h2>

- <s>WebSecurityConfigurerAdapter를 상속하여 configure 메서드를 오버라이드 해서 사용하기(v0)</s>
- 클라이언트 세션 유지를 Spring Boot와 JWT(JSON Web Token)로만 구현해보기(v1,v2,v3)
- Spring Security를 Security 6.2.1 버전을 이용하여 구현해보기
- 기기에서의 사용자 식별을 위한 OAuth2.0 을 사용예정(구글)

<h2>프로젝트 목적</h2>

- 엔드포인트에서 Bearer Token을 Authorization 헤더에 넣어서 전달하는 방식을 사용해 보자.
- 현재 web과 api에서 많이 사용하고 있기에 공부하기 위함.
- 2022.02.21 WebSecurityConfigurerAdapter 사용하는것을 권장하지 않음
- 개발자와 버전별로 다른 구현을 하기에 여러가지 구성해보기 위함


<h2>v4 버전 및 의존성</h2>

- Spring Boot 3.2.1
- Security 6.2.1
- Lombok
- Spring Data JPA - MySQL
- Gradle - Groovy
- IntelliJ Ultimate


출처및 참고자료
- https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
- https://docs.spring.io/spring-security/reference/servlet/architecture.html
- https://www.youtube.com/@xxxjjhhh
- https://substantial-park-a17.notion.site/Docs-002024551c294889863d0c7923590568
