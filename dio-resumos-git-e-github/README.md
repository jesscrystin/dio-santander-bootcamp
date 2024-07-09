# Dio | Resumos Git e GitHub

## 📃 Doumentação
- [Documentação Git](https://git-scm.com/doc)
- [Documentação GitHub](https://docs.github.com/)
- [Documentação .md (Mark Down) (linguagem de marcação simples)](https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/quickstart-for-writing-on-github)

## 💻 Resumos das aulas

### GIT

*Versionamento de código, ou sistema de controle de versão*

Controlam as versões de um arquivo ao longo do tempo

- Regista o histórico de atualizações de um arquivo;
- Gerencia quais foram os alterações, data, autor, etc.;
- Organização, controle e segurança.

#### Tipos de sistema de controle de versão (VCS)

- VCS centralizado (CVCS)
    - ex.; CVS,subversion.
- VCS distribuído (DVCS)
    - ...ex.; Git,Mercurial.

#### VCS Distribuído (DVCS)

Clona o repositório completo, o que inclui o histórico de versões.

- Cada clone é como um backup;
- Possibilita um fluxo de trabalho flexível;
- Possibilidadade de trabalho sem conexão à rede.

<details open>
<summary>Comandos básicos do Git</summary>

| Comando    | Descrição    |
|  --------- | ------------ |
| `git clone` | Clona um repositório Git existente para um novo diretório (pasta) local. |
|`git commit` | Gravar alterações no repositório.| 
| `git pull` | "puxa" as alterações do repositório remoto para o local    (busca e mescla).|
|`git push`| "Empurra" as alterações do repositório local para o remoto.|
---
</details>

### GitHub

Plataforma de hospedagem de código para controle de versão com o git, e colaboração. 


#### Desfazendo alterações no repositório local

- `git restore <nome-do-arquivo>`: Descarta todas as mudanças que fezemos na antes do ultimo salvamento. (Use com cuidado).

- `git commit --amend -m"nova mensagem"` - corrigi a mensagem errada do último commit.

- Desfazendo commit com `git reset`
    - `git reset --soft` - remove o commit e volta os arquivos para o stage(índice/área de preparação);
    - `git reset --maxid` (comportamento padrão), nessa opção tira até do stage;
    - `git reset --hard` - apaga tudo.
 - `git reflog` - detalhamento maior dos commits

#### Branch - ramificação do projeto

A **branch** nova aponta para o último commit criado.

<details open>
<summary>Comandos básicos do Git</summary>

| Comando    | Descrição    |
|  --------- | ------------ |
| `git checkout -b <nome-da-branch>` | Cria uma nova branch.|
|`git checkout <nome-da-branch>` | Caminha entre as branchs.| 
| `git branch -v` | Mostra o último commit de cada branch".|
|`git merge <nome-da-branch>`| Mescla as branchs.|
|`git branch`| Lista as branchs.|
|`git branch -d`| Excluir a branch.|
---
</details>

#### Comandos úeis no dia a dia

 | Comando    | Descrição    |
|  --------- | ------------ |
|`git fetch orgin <nome-da-branch> `| Baixa as alterações sem mesclar|
|`git merge`| Mescla as alterações.|
|`git pull`| junção do comando git-fatch + git merge.|
|`git diff <nome-da-branch-local>  origin/<nome-da-branch-remota>`| Ver diferença entre as branchs.|
|`git clone URL --branch <nome-da-branch> --single-branch`| Baixar uma bransh só.|
|`git stash`| Arquiva modificações feitas na branch atua. Útil para criação de uma nova branch.|
|`git stash list`| lista as modificações arquivadas.|
|`git stash pop`| Voltar com a alterações e apagar as feitas depois do stash.|
|`git stash apply`| Voltar com as alterações e manter as alterações feitas depois do stash.|
---
</details>

### Links úteis 

- [Material de apaio - dio-curso-git-github](https://github.com/elidianaandrade/dio-curso-git-github)
- [Slide da aula](https://academiapme-my.sharepoint.com/:p:/g/personal/renato_dio_me/EYjkgVZuUv5HsVgJUEPv1_oB_QWs8MFBY_PBQ2UAtLqucg?rtime=9VgBe3l23Eg)


| Tipo de Commit | Descrição  | Exemplo |
| -------------- | ---------- | ------- |
| feat | Adiciona uma nova funcionalidade ao projeto. | feat: add USENAME.md profile |
| fix | Corrige um bug ou problema no projeto. | fix: fixed issue fix#IssueNumber |
| docs | Altera a documentação do projeto. | docs: update README.md |
| style | Realiza mudanças na aparência, sem alterar a funcionalidade. | style: add EFFECTNAME to COMPONENT |
| refactor | Realiza mudanças no código que não alteram a funcionalidade. | refactor: refactor at CLASSNAME | 
| test | Adiciona ou modifica testes no projeto. | test: add unit test for UserService |
---



