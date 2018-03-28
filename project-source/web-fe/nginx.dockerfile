FROM nginx:1.13.6

# VOLUME /public

# Copy custom nginx config
RUN mkdir -p /data/nginx/cache
COPY ./config/nginx.conf /etc/nginx/nginx.conf

# Copy custom nginx config
#COPY ./public /var/www/public

# EXPOSE 80

# ENTRYPOINT ["nginx"]
# CMD ["-g", "daemon off;"]

# To build:
# docker build -f nginx.dockerfile --tag ace/nginx ../

# To run: 
# docker run -d -p 80:6379 --name nginx ace/nginx