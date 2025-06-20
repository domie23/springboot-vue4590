const base = {
    get() {
        return {
            url : "http://localhost:8080/springcloud42bg5/",
            name: "springcloud42bg5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springcloud42bg5/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微服务的车联网位置信息管理软件的设计与实现"
        } 
    }
}
export default base
