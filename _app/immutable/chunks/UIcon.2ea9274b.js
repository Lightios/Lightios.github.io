import{w as k,b as w}from"./paths.f8597292.js";import{S as J,i as x,s as A,k as j,l as M,m as _,h as u,p as d,b as D,n as m}from"./index.f1690066.js";const f="@riadh-adrani-theme",N=e=>{localStorage.setItem(f,JSON.stringify(e))},h=k(!1),l=e=>h.update(t=>{var n;const a=typeof e=="boolean"?e:!t;return N(a),(n=document.querySelector(":root"))==null||n.setAttribute("data-theme",a?"dark":"light"),a}),L=()=>{const e=localStorage.getItem(f);e?l(JSON.parse(e)):window.matchMedia&&window.matchMedia("(prefers-color-scheme: dark)").matches?l(!0):l(!1)},v=e=>`${w}/logos/${e}`,s=(e,t)=>t?{dark:v(t),light:v(e)}:v(e),U={AWS:s("aws.svg"),Bootstrap:s("bootstrap.svg"),C:s("c.svg"),Cpp:s("cpp.svg"),Celery:s("celery.svg"),Compose:s("jetpack-compose.png"),Django:s("django.svg"),FastApi:s("fastapi"),Flask:s("flask.svg"),Go:s("go.svg"),Kafka:s("kafka.svg"),Neo4j:s("neo4j.svg"),Nginx:s("nginx.svg"),Numpy:s("numpy.svg"),Pandas:s("pandas.svg"),RabbitMQ:s("rabbitmq.svg"),Rust:s("rust.svg","rust-dark.png"),Scrapy:s("scrapy.png"),Selenium:s("selenium.svg"),Docker:s("docker.svg"),Kubernetes:s("kubernetes.svg"),Csharp:s("csharp.svg"),Xamarin:s("xamarin.svg"),TypeScript:s("ts.png"),VueJs:s("vue.png"),ReactJs:s("react.svg"),Dart:s("dart.png"),Kotlin:s("kotlin.png"),KivyMD:s("kivymd.png"),Python:s("python.png"),NodeJs:s("node.png"),Deno:s("deno.png","deno-dark.png"),Svelte:s("svelte.png"),ExpressJs:s("express.png"),JavaScript:s("js.png"),Fastify:s("fastify.svg","fastify-dark.png"),NestJs:s("nest.svg"),Quasar:s("quasar.svg"),SolidJs:s("solid.svg"),Electron:s("electron.png"),Flutter:s("flutter.svg"),Java:s("java.png"),AdonisJs:s("adonis.png"),Android:s("android.png"),Angular:s("angular.png"),PostgreSQL:s("postgres.png"),Firebase:s("firebase.png"),Sass:s("sass.png"),Unknown:s("no-img.svg"),MongoDB:s("mongodb.svg"),Redis:s("redis.svg"),Tailwind:s("tailwind.svg"),HTML:s("html.svg"),Premiere:s("premiere.svg"),Photoshop:s("photoshop.svg"),CSS:s("css.svg"),AfterEffects:s("after-effects.svg"),Illustrator:s("illustrator.svg"),Nuxt:s("nuxt.png"),Vite:s("vite.png"),Vitest:s("vitest.svg"),Jest:s("jest.png"),Unocss:s("unocss.svg"),Ruvy:s("ruvy.svg"),Postcss:s("postcss.svg"),Polish:s("pl.svg"),English:s("en.png"),Demiurg:s("demiurg.png"),MasterSystem:s("master-system.png"),ValorantLineups:s("valorant-lineups.png"),DayMath:s("daymath.png"),Latex:s("latex-black.png","latex-white.png"),ZSZ:s("zsz.png"),UJ:s("uj.png"),Math:s("math.png"),Freelance:s("freelance.png"),Recommendation:s("recommendation.png")};let y;h.subscribe(e=>y=e);const E=e=>typeof e=="string"?e:y?e.dark:e.light;globalThis&&globalThis.__awaiter;function C(e){let t,a;return{c(){t=j("i"),this.h()},l(n){t=M(n,"I",{class:!0}),_(t).forEach(u),this.h()},h(){d(t,"class",a=`${e[0]} ${e[1]}`)},m(n,g){D(n,t,g)},p(n,[g]){g&3&&a!==(a=`${n[0]} ${n[1]}`)&&d(t,"class",a)},i:m,o:m,d(n){n&&u(t)}}}function R(e,t,a){let{icon:n=void 0}=t,{classes:g=""}=t;return e.$$set=o=>{"icon"in o&&a(0,n=o.icon),"classes"in o&&a(1,g=o.classes)},[n,g]}class I extends J{constructor(t){super(),x(this,t,R,C,A,{icon:0,classes:1})}}export{U as A,I as U,l as a,E as g,L as o,h as t};
