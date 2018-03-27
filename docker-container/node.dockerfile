FROM node:latest

COPY      . /var/api
WORKDIR   /var/api

RUN       npm install

EXPOSE 8080

ENTRYPOINT ["npm", "start"]

# To build:
# docker build -f node.dockerfile --tag ace/node ../

# To run:
# docker run -d -p 8080:8080 -v $(PWD):/var/api/ -w /var/api ace/ace-node
