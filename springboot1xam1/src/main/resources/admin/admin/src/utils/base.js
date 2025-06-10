const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot1xam1/",
            name: "springboot1xam1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot1xam1/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "火车订票管理系统"
        } 
    }
}
export default base
