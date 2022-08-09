# swaggertest
ref:

lombok
springWeb

버전은 https://mvnrepository.com/artifact/io.springfox/springfox-boot-starter 에서 확인.
Swagger 2.x 버전과 다르게 springfox-boot-starter 하나만 추가하면 하위에 필요한 모든 라이브러리가 포함.

implementation 'io.springfox:springfox-boot-starter:3.0.0'

Docket: Swagger 설정의 핵심이 되는 Bean

useDefaultResponseMessages: Swagger 에서 제공해주는 기본 응답 코드 (200, 401, 403, 404). false 로 설정하면 기본 응답 코드를 노출하지 않음

apis: api 스펙이 작성되어 있는 패키지 (Controller) 를 지정

paths: apis 에 있는 API 중 특정 path 를 선택

apiInfo:Swagger UI 로 노출할 정보
