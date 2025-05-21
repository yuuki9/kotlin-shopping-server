##  🛒 도메인 주도 설계와 헥사고날 구조를 활용한 커머스 서비스 플랫폼
###  🎯 프로젝트 개요
자바 : 17

언어 및 프레임워크: Kotlin, Spring Boot

아키텍처: 헥사고날 아키텍처 (Ports & Adapters)

데이터베이스: PostgreSQL

테스트: JUnit, Testcontainers

배포 환경: AWS 프리티어 (EC2, RDS, S3 등)

CI/CD: GitHub Actions, Docker

문서화 : swagger
<br>
<br>
### 🧪 테스트 전략
단위 테스트: 도메인 및 애플리케이션 계층의 로직 검증

통합 테스트: Testcontainers를 활용한 PostgreSQL 연동 테스트

계측 테스트: API 엔드포인트 및 전체 플로우 검증
레딧
<br>
<br>
### ☁️ 클라우드 네이티브 환경
AWS EC2: 애플리케이션 서버 호스팅

AWS RDS (PostgreSQL): 데이터베이스 관리

AWS S3: 정적 파일 저장

Docker: 컨테이너 환경 배포

GitHub Actions: CI/CD 파이프라인 구축
<br>
<br>
### 📦 주요 기능
상품 등록 및 조회

장바구니 기능

주문 처리 및 결제 연동 (모의 구현)

사용자 인증 및 권한 관리


