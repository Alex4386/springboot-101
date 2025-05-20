<h1 align="center">Springboot 101</h1>

## Syllabus
* Subject Name: `Advanced Web Programming`
* Subject Code: `14856_001`
* Lecturer: `Seongja Choi`
* Goals:
  - SW development ability applying SW architecture
  - Cultivating talent with front-end & back-end technology
  - Students develop an understanding of engineering based on software architecture.
  - Derivation of results through code review and PBL at the practical level
  - Learning to discriminate between SW architecture thinking and characteristics

## Build Guide
This repository utilizes gradle multi-project for streamlined monorepo experience. To run the specific project (i.e. `week02`), run the following command:
```bash
./gradlew :week02:bootRun
```

Due to some of the weeks requiring multiple projects to be run, some of the projects have nested projects. To run the specific project (i.e. `week11/client-service-a`), run the following command:
```bash
./gradlew :week11:client-service-a:bootRun
```
