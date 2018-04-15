# tc-parent

### 环境配置

- 安装postgresql

```
yum install https://download.postgresql.org/pub/repos/yum/9.5/redhat/rhel-7-x86_64/pgdg-centos95-9.5-2.noarch.rpm

yum install postgresql95-server postgresql95-contrib

systemctl enable postgresql-9.5.service

systemctl start postgresql-9.5.service

sudo su postgres 
psql postgres
ALTER USER postgres with PASSWORD 'zcj19921123'
\q
exit
vi /var/lib/pgsql/9.5/data/postgresql.conf
修改#listen_addresses = 'localhost'  为  listen_addresses='*'
// 防火墙配置略，腾讯云防火墙默认关闭
systemctl restart postgresql-9.5.service

```

- nginx 安装

```
// 1 添加Nginx到YUM源
sudo rpm -Uvh http://nginx.org/packages/centos/7/noarch/RPMS/nginx-release-centos-7-0.el7.ngx.noarch.rpm
// 2.安装Nginx
sudo yum install -y nginx
// 3.启动Nginx
sudo systemctl start nginx.service
// 4.CentOS 7 开机启动Nginx
sudo systemctl enable nginx.service

// 安装目录
/etc/nginx

sudo nginx -s reload
sudo service nginx restart
sudo nginx -s stop
```

- jdk 安装

```
// 新建文件夹
/usr/web/java/
// 将tar.gz 文件传到对应服务器
// 添加环境变量
export JAVA_HOME=jdk文件所在目录
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
// 执行命令
source /etc/profile

java -version
```

- redis-service 安装

```
yum install gcc make
// cd 至对应目录 eg：/usr/web/download/redis/
curl http://download.redis.io/releases/redis-4.0.9.tar.gz -o redis-4.0.9.tar.gz
tar zxvf redis-4.0.9.tar.gz
cd redis-4.0.9
make
cd utils/
./install_server.sh 
netstat –apn | grep 6379
```



