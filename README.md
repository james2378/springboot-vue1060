### 介绍
java毕业设计，人事管理系统
### 3000多套系统，需要联系
抠：3565014707 微：a13424421017

#### 软件架构
##### 整体架构模式
这是一个 企业级办公自动化（OA）系统，采用 前后端分离架构，包含以下模块：

管理后台（src/main/resources/admin）：基于 Vue.js + ElementUI 的 SPA 应用，供管理员和HR使用。

员工端（src/main/resources/front）：基于 Layui + jQuery 的传统前端，面向员工提供自助服务（如报销、请假、考试）。

后端服务（src/main/java/com）：基于 Spring Boot + MyBatis 的 Java 服务，提供 RESTful API 和核心业务逻辑。

##### 分层架构设计
后端分层：

Controller层：controller 包（如 CaiwubaoxiaoController）处理 HTTP 请求，返回 JSON 数据。

Service层：service 包（CaiwubaoxiaoService）实现业务逻辑（如报销审批、考试评分）。

DAO层：dao 包（CaiwubaoxiaoDao）通过 MyBatis XML 文件（CaiwubaoxiaoDao.xml）操作数据库。

实体与数据模型：

entity 包定义数据库实体（如 CaiwubaoxiaoEntity 财务报销实体）；

vo（值对象）和 view（视图模型）用于接口数据传输和复杂查询结果封装。

前端分层：

管理后台（Vue.js）：

视图层：views/modules 定义页面（如 caiwubaoxiao 报销审批页）。

组件层：components 封装可复用组件（如 BreadCrumbs 面包屑导航）。

状态管理：通过 Vuex（store.js）管理全局状态（如用户权限、审批流程）。

员工端（Layui）：

传统 MVC：通过 HTML + jQuery 实现动态页面（如 qingjia/add.html 请假申请页）。

##### 关键技术特性
权限控制：

后端通过 AuthorizationInterceptor 拦截器和 @APPLoginUser 注解实现接口权限校验；

前端管理后台通过路由（router-static.js）限制页面访问权限（如HR可见薪酬模块）。

异步处理：

MyThreadMethod 可能用于异步任务（如批量导入员工数据、定时发送审批提醒）。

复杂表单与文档：

富文本编辑器（tinymce）支持带附件的报销单填写（如上传发票图片至 static/upload）。

#### 核心功能模块解析
##### 财务管理模块
报销管理：

caiwubaoxiao（财务报销）：员工提交报销单（含费用明细、发票附件），审批流支持多级审核（部门经理→财务）。

dictionaryCaiwubaoxiaoYesno（审批状态字典）：定义报销单状态（待提交/审批中/已驳回/已打款）。

数据统计：

按部门/时间段统计报销总额，生成可视化报表（如柱状图展示月度支出）。

##### 考勤与假期管理
请假审批：

qingjia（请假申请）：员工填写请假类型（年假/病假）、时间范围，系统自动计算剩余假期余额。

dictionaryQingjiaYesno（请假审批状态）：支持HR一键批量审批。

考勤异常处理：

与打卡系统集成，自动标记缺勤记录并触发异常流程。

##### 培训与考试模块
在线考试：

exampaper（试卷管理）：HR发布考试（如安全培训试题），设置时间限制和及格分数。

examrecord（考试记录）：员工完成考试后系统自动评分，错题自动归档至 examrewrongquestion。

学习资源：

gonggao（公告通知）：发布培训材料或考试安排，支持PDF/PPT附件上传。

##### 组织架构管理
部门与职位：

dictionaryBumen（部门字典）：维护公司组织架构（如技术部/市场部）。

dictionaryZhiwu（职位字典）：定义岗位职级（如P6工程师/部门总监）。

员工信息：

yonghu（员工档案）：管理入职信息、合同记录、薪酬等级。
