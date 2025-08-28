# 🤝 Guía para Contribuir

Gracias por colaborar en este repositorio 🙌  
La idea es mantenerlo ordenado y profesional, ya que también funcionará como **portfolio académico**.

---

## 📌 Reglas generales
- **No subir archivos directamente al branch `main`.**  
  El `main` debe contener solo:
    - `README.md`
    - `LICENSE`
    - `.gitignore`
    - Archivos de configuración general (si aplica)

- **Cada estudiante trabaja en su propia branch personal.**  
  Ejemplos de nombres:
    - `branch-nombre1`
    - `branch-nombre2`
    - `branch-nombre3`

- **Commits claros y descriptivos.**  
  ✅ `Agrego TP1 de Lógica`  
  ✅ `Corrijo ejercicio 5`  
  ❌ `cosas`  
  ❌ `update`

---

## 🚀 Cómo empezar
1. Hacer un fork o clonar el repo:
    ```bash
    git clone https://github.com/usuario/repositorio.git
   
2. Crear tu propia `branch` personal:
    ```bash
    git checkout -b branch-tu-nombre

3. Subir tus archivos a tu `branch`:
    ```bash
    git add .
    git commit -m "Agrego TP1 de Lógica"
    git push origin branch-tu-nombre

---

## 🔀 Pull Requests
- No es necesario hacer PR hacia `main` salvo para:
    - Actualizar este README
    - Cambiar la licencia
    - Ajustar configuración global

- Si querés proponer cambios a `main`, creá un **Pull Request** claro con:
    - Descripción del cambio
    - Motivo por el cual es útil
    - Archivos afectados

---

## ✅ Buenas prácticas
- Usar siempre `.gitignore` para no subir archivos de IDEs (IntelliJ, Eclipse, VSCode).
- No subir archivos comprimidos (.zip, .rar, etc.), mejor carpetas organizadas.
- Dividir las actividades en carpetas por materia o tema.
- Escribir commits en **español y en presente** (ej: “Agrego TP1”, no “Agregado TP1”).  
