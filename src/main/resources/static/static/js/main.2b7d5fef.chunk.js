(this.webpackJsonpfrontend=this.webpackJsonpfrontend||[]).push([[0],{22:function(e,a,t){},23:function(e,a,t){},43:function(e,a,t){"use strict";t.r(a);var s=t(2),n=t.n(s),r=t(12),i=t.n(r),o=(t(22),t.p,t(23),t(0));var c=function(e){e&&e instanceof Function&&t.e(3).then(t.bind(null,44)).then((function(a){var t=a.getCLS,s=a.getFID,n=a.getFCP,r=a.getLCP,i=a.getTTFB;t(e),s(e),n(e),r(e),i(e)}))},l=t(13),p=t(14),d=t(17),u=t(16),h=function(e){Object(d.a)(t,e);var a=Object(u.a)(t);function t(){var e;Object(l.a)(this,t);for(var s=arguments.length,n=new Array(s),r=0;r<s;r++)n[r]=arguments[r];return(e=a.call.apply(a,[this].concat(n))).state={displayName:"",username:"",password:"",passwordRepeat:"",pendingApiCall:!1},e.onChangeDisplayName=function(a){var t=a.target.value;e.setState({displayName:t})},e.onChangeUsername=function(a){var t=a.target.value;e.setState({username:t})},e.onChangePassword=function(a){var t=a.target.value;e.setState({password:t})},e.onChangePasswordRepeat=function(a){var t=a.target.value;e.setState({passwordRepeat:t})},e.onClickSignup=function(){var a={username:e.state.username,displayName:e.state.displayName,password:e.state.password};e.setState({pendingApiCall:!0}),e.props.actions.postSignup(a).then((function(a){e.setState({pendingApiCall:!1})})).catch((function(a){e.setState({pendingApiCall:!1})}))},e}return Object(p.a)(t,[{key:"render",value:function(){return Object(o.jsxs)("div",{className:"container",children:[Object(o.jsx)("h1",{className:"text-center",children:"Sign Up"}),Object(o.jsxs)("div",{className:"col-12 mb-3",children:[Object(o.jsx)("label",{children:"Display Name"}),Object(o.jsx)("input",{className:"form-control",placeholder:"Your display name",value:this.state.displayName,onChange:this.onChangeDisplayName})]}),Object(o.jsxs)("div",{className:"col-12 mb-3",children:[Object(o.jsx)("label",{children:"Username"}),Object(o.jsx)("input",{className:"form-control",placeholder:"Your username",value:this.state.username,onChange:this.onChangeUsername})]}),Object(o.jsxs)("div",{className:"col-12 mb-3",children:[Object(o.jsx)("label",{children:"Password"}),Object(o.jsx)("input",{className:"form-control",placeholder:"Your password",type:"password",value:this.state.password,onChange:this.onChangePassword})]}),Object(o.jsxs)("div",{className:"col-12 mb-3",children:[Object(o.jsx)("label",{children:"Password Repeat"}),Object(o.jsx)("input",{className:"form-control",placeholder:"Repeat your password",type:"password",value:this.state.passwordRepeat,onChange:this.onChangePasswordRepeat})]}),Object(o.jsx)("div",{className:"text-center",children:Object(o.jsxs)("button",{className:"btn btn-primary",onClick:this.onClickSignup,disabled:this.state.pendingApiCall,children:[this.state.pendingApiCall&&Object(o.jsx)("div",{className:"spinner-boarder text-light spinner-boarder-sm mr-sm-1",role:"status",children:Object(o.jsx)("span",{className:"sr-ony",children:"Loading..."})}),"Sign Up"]})})]})}}]),t}(n.a.Component);h.defaultProps={actions:{postSignup:function(){return new Promise((function(e,a){e({})}))}}};var m=t(15),j=t.n(m),b={postSignup:function(e){return j.a.post("/api/1.0/users",e)}};i.a.render(Object(o.jsx)(n.a.StrictMode,{children:Object(o.jsx)(h,{actions:b})}),document.getElementById("root")),c()}},[[43,1,2]]]);
//# sourceMappingURL=main.2b7d5fef.chunk.js.map