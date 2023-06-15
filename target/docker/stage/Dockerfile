FROM openjdk:8-jre-alpine
LABEL MAINTAINER="Dennis.gotto@gmail.com"
WORKDIR /opt/docker
COPY --chown=daemon:root opt /opt
EXPOSE 9000
USER daemon
ENTRYPOINT ["/opt/docker/bin/canvas-demo"]
CMD []
