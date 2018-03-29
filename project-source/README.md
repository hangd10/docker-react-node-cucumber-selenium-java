Chrome Selenium Drivers - https://chromedriver.storage.googleapis.com/index.html

# -i (interactive)
# -t Allocate a pseudo-TTY

# find network name using 'docker network ls'
docker run -it --rm \
       -v "$(pwd)":/opt/maven \
       -v "$HOME/.m2":/root/.m2 \
       -w /opt/maven \
       --network projectsource_default \
       maven:3.3.9-jdk-8 \
       mvn clean test    