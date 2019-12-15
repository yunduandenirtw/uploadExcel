FROM java:8

ENV PROJECT_ARTIFACTID="uploadExcel" PROJECT_VERSION="0.0.1-SNAPSHOT"

COPY target/$PROJECT_ARTIFACTID-$PROJECT_VERSION.jar /uploadExcel.jar

EXPOSE 8004

ENTRYPOINT ["java", "-jar", "uploadExcel.jar"]
