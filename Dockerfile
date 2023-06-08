FROM openjdk:8-jre-alpine as stage0
LABEL snp-multi-stage="intermediate"
LABEL snp-multi-stage-id="5c6d9724-b1a6-4f2f-aae7-86d54389424a"
WORKDIR /opt/docker
COPY opt /opt
USER root
RUN ["chmod", "-R", "u=rX,g=rX", "/opt/docker"]
RUN ["chmod", "u+x,g+x", "/opt/docker/bin/canvas-demo"]

FROM openjdk:8-jre-alpine
LABEL MAINTAINER="Dennis.gotto@gmail.com"
WORKDIR /opt/docker
COPY --from=stage0 --chown=daemon:root /opt/docker /opt/docker
EXPOSE 9000
USER daemon
ENTRYPOINT ["/opt/docker/bin/canvas-demo"]
CMD []
