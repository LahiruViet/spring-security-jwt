
truncate table dev.T_USER;

insert into dev.T_USER (username, password, role)
values ('lahiru', '$2y$12$i02uba1IF6zfB70yaa/R8ui3ejpyXnW0YCnalJLZNne5qY5.giPG2', 'ADMIN');

insert into dev.T_USER (username, password, role)
values ('immense', '$2y$12$FIHNldlyjdln0gLl1qHwcumRR7Nvfb2k0T/twC6vxcu6XtBWk4SUm', 'USER');
