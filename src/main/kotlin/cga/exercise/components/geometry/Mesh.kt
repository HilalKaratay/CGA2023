package cga.exercise.components.geometry

import org.lwjgl.opengl.GL30.*

/**
 * Creates a Mesh object from vertexdata, intexdata and a given set of vertex attributes
 *
 * @param vertexdata plain float array of vertex data
 * @param indexdata  index data
 * @param attributes vertex attributes contained in vertex data
 * @throws Exception If the creation of the required OpenGL objects fails, an exception is thrown
 *
 * Created 29.03.2023.
 */
class Mesh(vertexdata: FloatArray, indexdata: IntArray, attributes: Array<VertexAttribute>) {
    //private data
    private var vaoId = 0
    private var vboId = 0
    private var iboId = 0
    private var indexcount = 0

    init {

       val indices = doubleArrayOf(
            -0.5,-0.5,0.0,0.0,0.0,1.0,
            0.5,-0.5,0.0,0.0,0.0,1.0,
            0.5,0.5,0.0,0.0,1.0,0.0,
            0.0,1.0,0.0,1.00,0.0,0.0,
            -0.5,0.5,0.0,0.0,1.0,0.0
        )
        // todo Aufgabe 1.2.2 (shovel geometry data to GPU and tell OpenGL how to interpret it)
    }

    /**
     * Renders the mesh
     */
    fun render() {
        // todo
    }

    /**
     * Deletes the previously allocated OpenGL objects for this mesh
     */
    fun cleanup() {
        if (iboId != 0) glDeleteBuffers(iboId)
        if (vboId != 0) glDeleteBuffers(vboId)
        if (vaoId != 0) glDeleteVertexArrays(vaoId)
    }
}