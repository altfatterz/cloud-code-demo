```bash
$ docker build -t altfatterz/cloud-code-demo .
```


```bash
$ docker images ls
```

```
...
altfatterz/cloud-code-demo                 latest              b4fae6002934        About a minute ago   102MB
<none>                                     <none>              cac9e24a3839        About a minute ago   697MB
...
```

### skaffold

```bash
$ skaffold dev
```

```bash
$ skaffold run --tail
```

```bash
$ skaffold delete

Cleaning up...
deployment.apps "cloud-code-demo-deployment" deleted
service "cloud-code-demo" deleted
Cleanup complete in 307.274496ms
```

Pruning should happen after Cleanup
Issue: https://github.com/GoogleContainerTools/skaffold/issues/2440


