FROM node:6.11.5

WORKDIR /usr/src/app
COPY package.json .
RUN  npm install

EXPOSE 8080
CMD [ "npm", "start" ]

COPY . .

# To build:
# docker build -f node.dockerfile --tag ace/node ../

# To run:
# docker run -d -p 8080:8080 -v $(PWD):/var/api/ -w /var/api ace/ace-node