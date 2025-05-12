## 📌 API 명세서

| 기능     | Method | URL           | Request Body                                 | Response Body                                 | 상태코드 |
|----------|--------|---------------|----------------------------------------------|------------------------------------------------|----------|
| 일정 등록 | POST   | /schedules     | `{ "title": "회의", "content": "팀 회의", "date": "2025-05-20", "password": "1234" }` | `{ "id": 1, "title": "회의", "content": "팀 회의", "date": "2025-05-20" }` | 201 Created |
| 일정 조회 | GET    | /schedules/{id} | 없음                                           | `{ "id": 1, "title": "회의", "content": "팀 회의", "date": "2025-05-20" }` | 200 OK |
| 일정 목록 | GET    | /schedules     | 없음                                           | `[ { "id": 1, "title": "회의", "content": "팀 회의", "date": "2025-05-20" }, ... ]` | 200 OK |
| 일정 수정 | PUT    | /schedules/{id} | `{ "title": "변경된 제목", "content": "변경된 내용", "date": "2025-05-21", "password": "1234" }` | `{ "id": 1, "title": "변경된 제목", "content": "변경된 내용", "date": "2025-05-21" }` | 200 OK |
| 일정 삭제
