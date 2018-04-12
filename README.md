# Young-Auth
基于Spring boot 、Spring Security开发的一个Sso单点登录系统、以及服务认证Demo

# Young-Auth-Client 
单点登录系统
    http://localhost:8082/
# Young-Auth-ResServer
资源系统
    访问方式：
        
        1、获取token
        
        POST: http://localhost:8080/oauth/token
        DATA: username=test&password=test&scope=read&client_id=SampleClientId&client_secret=secret&grant_type=password
        RESP:
        {
            "access_token": "e402162f-f902-473c-b093-8b8b12758d67",
            "token_type": "bearer",
            "refresh_token": "9a80a73d-3937-4975-9b8a-a7ee35f45ab3",
            "expires_in": 43199,
            "scope": "read,write,foo,bar"
        }
        
        2、访问资源
        http://localhost:8081/test?access_token=62840e93-1a9f-4152-ac84-eb1508c6bf2b 
        返回Hello Test
        
# Young-Auth-Server
授权认证系统
    其中客户端和用户都是直接写在代码中的，可以根据自己需要将Client和Token存储在数据库中

# 码云地址:https://gitee.com/meidea/Young-Auth.git     
# GitHub地址:https://github.com/MinicoYoung/Young-Auth.git