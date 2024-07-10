const base = {
    get() {
        return {
            url : "http://localhost:8080/meishishangcheng/",
            name: "meishishangcheng",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/meishishangcheng/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "美食推荐商城"
        } 
    }
}
export default base
