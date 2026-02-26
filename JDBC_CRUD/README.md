## JDBC를 활용하여 CRUD 구현

### Eclipse Marketplace - WindowBuilder Current - install 하여 GUI로 Swing컴포넌트 구현

<img width="1905" height="941" alt="image" src="https://github.com/user-attachments/assets/fe3533cc-4dfe-4342-89e1-2fed0d48deb8" />

### 아키텍처 구조 - MVC 패턴(Model-View-Controller)

- Model - AddrDTO : 데이터를 담는 객체, 데이터베이스의 한 행을 자바 객체로 매핑합니다.
- view-Controller - Main : Swing을 이용한 화면 구성(UI)과 사용자의 버튼 클릭 이벤트를 처리하는 로직
- AddrDAO - 데이터베이스와의 연결 및 쿼리 실행(CRUD) 객체

### AddrDAO

- GetConn() : DB연결/ Class.forName()으로 드라이버로드 / DB 연결 정보를 AddrDAO에 직접 작성을 했지만 실제 서비스라면 보안상 위험하기에 별도의 파일에 저장하여 시스템 환경 변수를 통해 불러오는 방식으로 개선하고자 함.
- close() : DB 해제
- SQL 실행 - prepareStatement : ? 사용으로 SQL 인젝션 공격 방어, 동일한 쿼리를 반복 실행할 때 재사용
- C : insert() : 사용자가 입력한 정보를 쿼리의 ?에 매핑하여 executeUpdate()로 실행 - 등록
- R : select(), selectOne() : 전체 혹은 특정 조건으로 조회
- U : update() : 테이블에서 선택된 행의 기본키(이름)를 기준으로 정보를 수정
- D : delete() : 이름을 기준으로 데이터를 삭제

<img width="1087" height="1017" alt="image" src="https://github.com/user-attachments/assets/46443005-179a-4025-8e56-cbc8c14f3b0e" />
