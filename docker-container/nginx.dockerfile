FROM nginx:latest

VOLUME /var/cache/nginx

# Copy custom nginx config
COPY ./config/nginx.conf /etc/nginx/nginx.conf

# Copy custom nginx config
COPY ./public /var/www/public

EXPOSE 80

ENTRYPOINT ["nginx"]
CMD ["-g", "daemon off;"]

# To build:
# docker build -f nginx.dockerfile --tag ace/nginx ../

# To run: 
# docker run -d -p 80:6379 --name nginx ace/nginx