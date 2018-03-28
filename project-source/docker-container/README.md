# -i (interactive)
# -t Allocate a pseudo-TTY
docker run -it --rm \
       -v "$(pwd)":/opt/maven \
       -v "$HOME/.m2":/root/.m2 \
       -w /opt/maven \
       maven:3.5-jdk-8 \
       mvn clean test